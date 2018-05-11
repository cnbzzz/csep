package com.infore.csep.gpsreceiver.service;

import com.infore.csep.common.ByteUtils;
import com.infore.csep.common.UnpackUtils;
import com.infore.csep.common.netty.dto.CsepPack;
import com.infore.csep.common.netty.dto.FactleachPack;
import com.infore.csep.common.netty.dto.GpsLocationPack;
import com.infore.csep.common.netty.dto.PlcPack4Gps;
import com.infore.csep.gpsreceiver.utils.HexUtil;

/**
 * Created by steven ma
 * 2018/5/7 11:16
 */

public class UploadCurrentLocationServiceTest {


    public static CsepPack getCsepPack(String strHex) throws Exception {

        byte[] bytes = HexUtil.hexStringToByte(strHex);

        int i = getXor(bytes) & 0xff;

        System.out.println("checkcode: " + i);

        CsepPack csepPack = UnpackUtils.unPack(bytes, CsepPack.class);

        return csepPack;
    }

    /**
     * 计算校验值
     * @param bytes
     * @return
     */
    public static byte getXor(byte[] bytes) {

        byte checkCode = bytes[2];

        for(int i = 3; i < bytes.length - 2; i++) {
            //checkCode = (int)(checkCode ^ bytes[i]);

            checkCode ^= bytes[i];
        }

        return checkCode;
    }


    //public static final String location = "5A4C1800000043632FE180301190010025D204090339341C0D002E70320006000C000000430000000000000000000000000000002222060D";

    public static void main(String[] args) throws Exception {

        //uploadCurrentLocation();
        uploadCurrentCondition();

        //printShort();
        //printString();
    }

    private static void printString() {

        String equmNo = "WJFSXD100.75";
        System.out.println(equmNo);

    }

    private static void printShort() {
        short s = 384;
        byte[] b = ByteUtils.short2Byte(s);
        for(byte bb: b) {

            System.out.println("b: " + bb);
        }
    }

    public static final String location = "5A4C1800000108541A9160900062010032D205090411031C0D445270320A4F005C6C004000000000187700000D8600000000009022373341422C303030303139353422810D";

    private static void uploadCurrentLocation() throws Exception {
        CsepPack csepPack = getCsepPack(location);
        System.out.println("uploadCurrentLocation: " + csepPack);

//        String pos = UnpackUtils.getValFromBytes(csepPack.getContent(), 0, 19, String.class);
//        System.out.println("pos: " + pos);
//        int oid = UnpackUtils.getValFromBytes(csepPack.getContent(), 20, 21, int.class);
//        int gps = UnpackUtils.getValFromBytes(csepPack.getContent(), 21, 22, int.class);
//        System.out.println("oid: " + gps);

        GpsLocationPack gpsLocationPack = UnpackUtils.unPack(csepPack.getContent(), GpsLocationPack.class);
        System.out.println("GpsLocationPack: " + gpsLocationPack);
    }

   // public static final String condition = "5A4C15000003D3541A91609000620100A702EE00A4000200000000000000980000000000000000000000000000F00000000000040000003F0034003F0032000000000000000027100000000000400000002D0000001C000000000000000000FA00000111010601E0002C00140000000000000000000000000000000000000000000000000000007D0000000000030000000000000000268B01020304050607080900574A465358440100002E070501030000000010006403E20D";

    public static final String condition = "5A4C1500000D04541A91609000620100A702EE00A4000200000000000000980001800000000000000000000000000000000000F00000000000040000003F0034003F0032000000000000000027100000000000400000002D0000001C000000000000000000FA00000111010601E0002C00140000000000000000000000000000000000000000000000000000007D0000000000030000000000000000268B00000102574A465358440100002E070501030000000010006403B80D";

    private static void uploadCurrentCondition() throws Exception {
        CsepPack csepPack = getCsepPack(condition);
        System.out.println("uploadCurrentCondition: " + csepPack);

        PlcPack4Gps plcPack4Gps = new PlcPack4Gps();
        int otherLen = 2 + 2 + 1 + 4 + 1 + 2 + 1;
        int contentLen = csepPack.getContentLength() - otherLen;

        System.out.println("ContenLen: " + contentLen + " otherLen: " + otherLen);


        plcPack4Gps.setContentLen(contentLen);

        plcPack4Gps = UnpackUtils.unPack(csepPack.getContent(), PlcPack4Gps.class, plcPack4Gps);
        System.out.println("PlcPack4Gps: " + plcPack4Gps);

        FactleachPack factleachPack= UnpackUtils.unPack(plcPack4Gps.getContent(), FactleachPack.class);

        System.out.println("factleachPack: " + factleachPack);

    }

}

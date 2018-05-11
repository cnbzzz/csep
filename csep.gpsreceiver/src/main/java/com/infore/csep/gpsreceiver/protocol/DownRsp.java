package com.infore.csep.gpsreceiver.protocol;

import com.infore.csep.gpsreceiver.entity.DownData;
import com.infore.csep.gpsreceiver.entity.Metadata;
import lombok.Data;

/**
 * Created by steven ma
 * 2018/4/27 18:06
 */
@Data
public class DownRsp {
    private int code;
    private String codedes;
    private Metadata[] metadatas;
    private DownData datas;
}

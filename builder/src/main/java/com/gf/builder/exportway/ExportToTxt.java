package com.gf.builder.exportway;

import com.gf.builder.model.ExportDataModel;
import com.gf.builder.model.ExportFooterModel;
import com.gf.builder.model.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

public class ExportToTxt {

    public void export(ExportHeaderModel exportHeaderModel,
                       Map<String, Collection<ExportDataModel>> mapData,
                       ExportFooterModel exportFooterModel) {

        StringBuilder builder = new StringBuilder();
        builder.append(exportHeaderModel.getDepId()).append(",").append(exportHeaderModel.getExportDate()).append("\n");

        for (String tblName : mapData.keySet()) {
            builder.append(tblName).append("\n");
            for (ExportDataModel exportDataModel : mapData.get(tblName)) {
                builder.append(exportDataModel.getProductId())
                        .append(",")
                        .append(exportDataModel.getAmount())
                        .append(",")
                        .append(exportDataModel.getAmount())
                        .append("\n");
            }
        }

        builder.append(exportFooterModel.getExportUser());

        System.out.println("输出的内容: \n" + builder.toString());

    }
}
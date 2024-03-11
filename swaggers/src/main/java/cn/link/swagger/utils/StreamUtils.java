package cn.link.swagger.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/** 流操作工具类 */
@Slf4j
public class StreamUtils {
  public static InputStream workbookConvertorStream(Workbook workbook) {
    InputStream in = null;
    // 临时缓冲区
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    try {

      // 创建临时文件
      workbook.write(out);
      byte[] bookByteAry = out.toByteArray();
      in = new ByteArrayInputStream(bookByteAry);
    } catch (Exception e) {
      log.error("error", e);
    } finally {
      if (out != null) {
        try {
          out.close();
        } catch (IOException ioe) {
          log.error("errot", ioe);
        }
      }
    }
    return in;
  }

  public static void byteToRespone() {}
}

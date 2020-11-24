package html2pdf.test;

import my.html2file.html2pdf.service.Html2PdfService;
import org.junit.Test;

/**
 * html转PDF测试
 *
 * @author 欧阳洁
 * @since 2018-03-28 15:35
 */
public class Html2PdfTest {
    @Test
    public void html2pdf() throws Exception {
        Html2PdfService html2PdfService = new Html2PdfService();//未引入spring，手动实例化
        html2PdfService.excute("file:///C:/Users/%E8%85%BE%E9%A3%9E/Desktop/%E9%87%91%E8%B4%9D%E5%B7%A5%E8%A1%8C/20062220281503100001.html");
    }
}

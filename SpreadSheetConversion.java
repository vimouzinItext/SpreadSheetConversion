import com.itextpdf.licensing.base.LicenseKey;
import com.itextpdf.pdfoffice.OfficeConverter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SpreadSheetConversion {
    public static void main(String[] args) throws IOException {
        LicenseKey.loadLicenseFile(new FileInputStream("test.json"));
        OfficeConverter.convertOfficePresentationToPdf(new FileInputStream("sample.xls"),new FileOutputStream("test.pdf"));
    }
}

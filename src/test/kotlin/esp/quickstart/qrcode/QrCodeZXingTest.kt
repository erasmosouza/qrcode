package esp.quickstart.qrcode

import org.junit.Assert
import org.junit.Test

class QrCodeZXingTest {

    @Test
    fun generateQrCodeTest() {

        var service: QrCodeZXing = QrCodeZXing()
        val imgArray: ByteArray = service.encode("Hello QrCode", 256, "png")

        Assert.assertTrue(imgArray.isNotEmpty())
    }
}
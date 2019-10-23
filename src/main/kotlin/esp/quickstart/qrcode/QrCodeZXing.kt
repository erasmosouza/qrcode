package esp.quickstart.qrcode

import com.google.zxing.BarcodeFormat
import com.google.zxing.EncodeHintType
import com.google.zxing.client.j2se.MatrixToImageWriter
import com.google.zxing.common.BitMatrix
import com.google.zxing.qrcode.QRCodeWriter
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel
import org.springframework.stereotype.Service
import java.io.ByteArrayOutputStream
import java.util.*

@Service
class QrCodeZXing: QrCodeFactory {

    override fun encode(qrCodeText: String, size: Int, fileType: String): ByteArray{
        var hintMap: MutableMap<EncodeHintType, Any> =
            EnumMap(EncodeHintType::class.java)

        // Now with zxing version 3.2.1 you could change border size (white border size to just 1)
        hintMap[EncodeHintType.MARGIN] = 1; /* default = 4 */
        hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);

        var qrCodeWriter: QRCodeWriter = QRCodeWriter()
        var byteMatrix: BitMatrix = qrCodeWriter.encode(qrCodeText, BarcodeFormat.QR_CODE, size, size, hintMap)

        val outputStream = ByteArrayOutputStream()

        MatrixToImageWriter.writeToStream(byteMatrix, fileType, outputStream)

        return outputStream.toByteArray()
    }
}
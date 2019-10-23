package esp.quickstart.qrcode

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RequestMapping("/qrcode")
@RestController
class QrCodeController {

    var qrCodeService: QrCodeFactory = QrCodeZXing()

    @ResponseBody
    @RequestMapping("/img", method = arrayOf(RequestMethod.GET), produces = [MediaType.IMAGE_PNG_VALUE])
    fun qrCodeImage(
        @RequestParam("content", defaultValue = "") content: String,
        @RequestParam("size", defaultValue = "256") size: Int,
        @RequestParam("fileType", defaultValue = "png") fileType: String
    ): ByteArray? {

        return qrCodeService.encode(content, size, fileType)
    }
}
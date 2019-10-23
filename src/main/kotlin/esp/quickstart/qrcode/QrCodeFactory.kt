package esp.quickstart.qrcode

interface QrCodeFactory {

    fun encode(qrCodeText: String, size: Int, fileType: String): ByteArray

}
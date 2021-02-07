package Delegation

class FileDownloader(private val file: String) : Downloader {
    override fun download() {
        println("Download $file")
    }

}

class FilePlayer(private val file: String) : Player {
    override fun play() {
        println("Player $file")
    }

}

class MediaFile(
        private val downloader: Downloader,
        private val player: Player) : Downloader by downloader, Player by player

fun main() {
    val file = "file.mkv"
    val mediaFile = MediaFile(FileDownloader(file), FilePlayer(file))
    mediaFile.download()
    mediaFile.play()

}
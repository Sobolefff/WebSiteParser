package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

const val BASE_URL = "https://mybook.ru/"

fun main() {
    val url = "${BASE_URL}author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"

    val doc: Document = Jsoup.connect(url).get()

    val citates: Elements = doc.select("div.sc-2aegk7-2.bzpNIu")

    for ((i, c) in citates.withIndex()) {
        println("${i + 1}. ${c.text()}")
    }
}

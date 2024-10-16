package com.lianyi

import com.lianyi.exts.getFile
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import java.sql.Timestamp

fun main() {

    val output = getFile("test_hoyolab_output.json")

    val client = OkHttpClient().newBuilder()
        .build()

    val request = Request.Builder()
        .url("https://sg-wiki-api.hoyolab.com/hoyowiki/hsr/wapi/get_entry_page_list")
        .addHeader("Referer", "https://wiki.hoyolab.com/")
        .addHeader("x-rpc-wiki_app", "hsr")
        .addHeader("x-rpc-language", "zh-cn")
        .post("{\"filters\":[],\"menu_id\":\"104\",\"page_num\":1,\"page_size\":50,\"use_es\":true}".toRequestBody("application/json".toMediaType()))
        .build()

    client.newCall(request).execute().use { res ->
        val result = res.body?.string() ?: "error"
        output.writeText(result)
    }

    println("task finish time = ${Timestamp(System.currentTimeMillis())}")

//    val xxHash = XXHash()
//
//    val docuemnt = Jsoup.connect(ApiEndport.secretTowerTalentMaterialList).get()
//
//
////    val gson = Gson()
////    val engine = ScriptEngineManager().getEngineByName("javascript")
//
//    val table = docuemnt.selectFirst(".wikitable") ?: error(".wikitable is null")
//    val rows = table.select("tr")
//
//    rows.forEach { row ->
//        val cells = row.select("td")
//
//        if (cells.size == 0) return@forEach
//
//        val a = cells[0].selectFirst("a") ?: error("a is null")
//        println("name = ${a.text()} url = ${a.attr("href")}")
//
//        val lastCell = cells.last() ?: error("last cell is empty")
//        val divs = lastCell.select("> div")
//
//        divs.forEach { div ->
//            if (div.children().size == 0) return@forEach
//
//            val font = div.select("font")
//            println(font.text())
//        }
//    }
}
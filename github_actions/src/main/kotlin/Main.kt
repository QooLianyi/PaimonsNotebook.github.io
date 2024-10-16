package com.lianyi

import com.lianyi.core.ApiEndport
import com.lianyi.exts.getFile

fun main() {

    getFile("test_${System.currentTimeMillis()}").writeText("hello world ! \n ${System.currentTimeMillis()}")

    println("task finish time = ${System.currentTimeMillis()}")

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
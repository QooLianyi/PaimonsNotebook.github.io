package com.lianyi.exts

@OptIn(ExperimentalStdlibApi::class)
fun Long.toHexStringUppercase(): String = this.toULong().toHexString().uppercase()
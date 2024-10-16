package com.lianyi.exts

import com.lianyi.core.CoreEnv
import com.lianyi.core.TaskType
import java.io.File
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

fun createNewFile(name: String) = File("${CoreEnv.PATH_ROOT}test.txt").createNewFile()

fun getFile(name: String, taskType: TaskType = TaskType.Test): File {
    val root = File(CoreEnv.PATH_ROOT,CoreEnv.getPathByTaskType(taskType))

    if(!root.exists()){
        root.mkdirs()
    }

    val file = File(root, name)

    return if (!file.exists()) {
        file.createNewFile()
        File(root, name)
    } else {
        file
    }
}

fun getParameterizedType(raw:Class<*>, vararg args: Type) = object : ParameterizedType {
    override fun getActualTypeArguments(): Array<out Type>  = args

    override fun getRawType(): Type = raw

    override fun getOwnerType(): Type? = null
}

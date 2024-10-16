package com.lianyi.core

object CoreEnv {

    //输出文件的根路径
    const val PATH_ROOT = "./actions_output/"

    //各个文件的hash map,避免不必要的更新
    const val FILE_HASH_MAP = "${PATH_ROOT}HashMap.json"

    const val PATH_TEST = "${PATH_ROOT}/test/"

    fun getPathByTaskType(taskType: TaskType): String = when (taskType) {
        else -> PATH_TEST
    }

}
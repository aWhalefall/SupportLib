package com.weichao.supportlib

import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(JUnit4::class)
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val list= listOf<String>(
            "https://github.com/aWhalefall/UnityResourceReplaceSwing",
            "https://github.com/aWhalefall/restartWorldTrunk",
            "https://github.com/aWhalefall/MMKV",
            "https://github.com/aWhalefall/gallary",
            "https://github.com/aWhalefall/NotificationExercise",
            "https://github.com/aWhalefall/strongswan",
            "https://github.com/aWhalefall/ViewPager2Sample-master",
            "https://github.com/aWhalefall/ScreenRecorder",
            "https://github.com/aWhalefall/Unity-Android",
            "https://github.com/aWhalefall/polymerization",
            "https://github.com/aWhalefall/wan Android",
            "https://github.com/aWhalefall/Lifecycles",
            "https://github.com/aWhalefall/andoridkotlin",
            "https://github.com/aWhalefall/Nydialog",
            "https://github.com/aWhalefall/RxjavaDemo",
            "https://github.com/aWhalefall/googledatabinding",
            "https://github.com/aWhalefall/dagger",
            "https://github.com/aWhalefall/MaterialDesignToolsbar"

        )
        val title= listOf<String>(
            "资源替换",
            "基础框架",
            "腾讯mmkv",
            "兼容android 10 相册选择",
            "通知demo",
            "strongswan vpn",
            "ViewPager2 demo",
            "录屏-unity",
            "Unity-Android demo",
            "wan Android",
            "Lifecycles 生命周期组件",
            "kotlin 练习",
            "Nydialog 全局dialog",
            "RxjavaDemo",
            "DataBinding",
            "dagger",
            "MaterialDesignToolsbar demo"

        )

        for((index,value) in title.withIndex()){
            println("| $value | [${list[index]}](${list[index]}) | |")
        }


    }
}
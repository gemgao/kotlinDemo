package com.ruicheng.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_kontlin.*

class KontlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kontlin)
        tv.text = "你好//"

        val ad = ad(2, 3)
        val sum = sum(1, 1)
        printSum(4, 5)
        val max = max1(ad, sum)
        tv.text = max.toString()
        getStringLength("3个字")

    }

    /**
     * 定义函数
     */
    //带有两个 Int 参数、返回 Int 的函数:
    fun ad(a: Int, b: Int): Int {
        return a + b
    }

    //将表达式作为函数体、返回值类型自动推断的函数:
    fun sum(a: Int, b: Int) = a + b

    //函数返回无意义的值:unit可以省略
    fun printSum(a: Int, b: Int): Unit {
        Log.i("-----", "${a + b}")//使用字符串模板
    }

    /**
     * 使用条件判断
     */

    fun max(x: Int, y: Int): Int {
        if (x > y) {
        return x
        }else{
            return y
        }
    }
    //另一种写法
    fun max1(x: Int, y: Int) = if (x > y) x else y
    /**
     * 使用类型检查及自动类型转换
     */
    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // `obj` 在该条件判断分支内自动转换成 `String`
            Log.i("---------","${obj.length}")
            return obj.length
        }

        // 在离开类型判断分支后， `obj` 仍然是 `Any` 类型
        return null
    }

    /**
     * 使用 for 循环
     */
    fun main(args: Array<String>) {
        for (arg in args)
            print(arg)
        //另一种
        for (i in args.indices)
            print(args[i])
    }
}

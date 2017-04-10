# Android studio中Kotlin配置和使用的图文详解 #

最近，Kotlin这个语言火了起来，号称是Android的swift（Kotlin的各种好处请自行百度），并且as2.3以上可以直接用kotlin写Android，所以我去体验了一下，踩过了坑，所以在这里记录一下。

首先呢，建立一个正常的Android项目，然后呢重点来了，studio会提醒你去设置Kotlin配置，不过我点了之后，过了1小时了还在配置，so，我决定自己来配置：

> 第一步：修改gradle文件

1.在你的project gradle下添加如下代码：（是在project gradle，是在project gradle，是在project gradle，重要的说三遍）

```
 classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:1.1.1"
```
![](http://img.blog.csdn.net/20170410134017938?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZ2VtZ2Fvemhlbg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
2.在你的app gradle下添加如下代码：（是在自己app gradle，是在自己app gradle，是在自己app，重要的说三遍）：

```
apply plugin: 'kotlin-android'
apply plugin: 'kotlin-android-extensions'

compile "org.jetbrains.anko:anko-common:0.8.2" 
compile "org.jetbrains.kotlin:kotlin-stdlib-jre7:1.1.1"
```
![这里写图片描述](http://img.blog.csdn.net/20170410134159220?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZ2VtZ2Fvemhlbg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
其中"org.jetbrains.anko:anko-common:0.8.2"这个依赖是kontlin为Android准备的一个库，可以简化好多代码，如果不想用，也可以不添加。
> 第二步：把刚刚创建的java文件变成kontlin文件

as菜单栏code--->convert java file to kontlin file,如下图：
![这里写图片描述](http://img.blog.csdn.net/20170410134233627?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZ2VtZ2Fvemhlbg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

设置完成后java代码就变成kontlin代码了，如下：

![这里写图片描述](http://img.blog.csdn.net/20170410134408097?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZ2VtZ2Fvemhlbg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

>第三步：现在配置就ok了，可以用kontlin写代码了：

如图，我给textview设置了一个文字，添加了点击跳转另一个页面，3行代码，确实比java简化了好多，更多深入的代码和功能我以后有时间了在发博客。

[Demo下载](https://github.com/gemgao/kotlinDemo)







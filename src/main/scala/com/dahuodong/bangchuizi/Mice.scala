package com.dahuodong.bangchuizi

import java.io.{File, FileInputStream, FileOutputStream}


object Mice {

  //大河东地里的一只老鼠，梦想着。。。

  // 等秋后收获玉米，在本地备份玉米，这样的话，假如丢失了一份玉米，冬天不至于挨饿，因为做了备份

  // 两个目录间备份文件，

  /*
  *args: ubuntu absolutly path
  * 1.source folder
  * 2.target folder
  *
  *    */

  def backup(sourcePath:String,targetPath:String): Unit = {
    //assert(args.length == 2)

    //val Array(source,target) = args

    val sourceFile = new File(sourcePath)
    //val targetFile = new File(target)

    if (sourceFile.exists()){
      /*new FileOutputStream(targetFile) getChannel() transferFrom(
        new FileInputStream(sourceFile) getChannel,0,Long.MaxValue
      )*/
    } else{
      throw new Exception(s"$sourceFile isn't exist")
    }


  }


  /*def recursiveCopy(f:File,sourceBase:String): Unit ={
    if (f.isDirectory){
      f.list().map(i => recursiveCopy(new File(i),sourceBase))
    }else{
      new FileOutputStream() getChannel() transferFrom(
        new FileInputStream(f) getChannel,0,Long.MaxValue
      )
    }
  }*/

}

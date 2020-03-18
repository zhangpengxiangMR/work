package com.test.word.命令模式.wrok;

import com.pykj.test.mode.gupao.designpatterns.行为型模式.命令模式.wrok.action.DownloadAction;
import com.pykj.test.mode.gupao.designpatterns.行为型模式.命令模式.wrok.action.ExitAction;
import com.pykj.test.mode.gupao.designpatterns.行为型模式.命令模式.wrok.action.LoginAction;
import com.pykj.test.mode.gupao.designpatterns.行为型模式.命令模式.wrok.action.UploadAction;

public class Test {


    public static void main(String[] args) {
        Fty fty = new Fty();
        IFtp iFty = new IFtp();
        iFty.execute(new LoginAction(fty));
        iFty.execute(new UploadAction(fty));
        iFty.execute(new DownloadAction(fty));
        iFty.execute(new ExitAction(fty));

    }

}

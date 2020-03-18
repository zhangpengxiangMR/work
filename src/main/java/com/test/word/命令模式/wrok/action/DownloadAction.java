package com.test.word.命令模式.wrok.action;

import com.test.word.命令模式.wrok.Fty;
import com.test.word.命令模式.wrok.IAction;

public class DownloadAction  implements IAction {

    private Fty iFty;

    public DownloadAction(Fty iFty) {
        this.iFty = iFty;
    }

    @Override
    public void execute() {
        iFty.download();
    }
}

package com.test.word.命令模式.wrok.action;


import com.pykj.test.mode.gupao.designpatterns.行为型模式.命令模式.wrok.Fty;
import com.pykj.test.mode.gupao.designpatterns.行为型模式.命令模式.wrok.IAction;

public class ExitAction implements IAction {

    private Fty iFty;

    public ExitAction(Fty iFty) {
        this.iFty = iFty;
    }

    @Override
    public void execute() {
        iFty.exit();
    }
}

package ru.func.takiwadai.entity.component.execute.simple;

/**
 * @author func 19.04.2020
 * @project ru.func.takiwadai.Takiwadai
 */
public class PhpRunner extends ScriptRunner {

    public PhpRunner() {
        super("\"{$PATH}\" {$FILE}", "C:\\Program Files\\php\\php.exe");
    }
}
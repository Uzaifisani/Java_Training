package day_4.custom_exception;

class LowBalanceExecption extends Exception {
    public LowBalanceExecption(String message){
        super(message);
    }
}

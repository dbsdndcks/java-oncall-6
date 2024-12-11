package oncall.controller;

import oncall.service.OncallService;
import oncall.view.InputView;
import oncall.view.OutputView;

public class OncallController {
    private InputView inputView;
    private OutputView outputView;
    private OncallService oncallService;

    public OncallController(InputView inputView, OutputView outputView, OncallService oncallService) {
        this.outputView = outputView;
        this.inputView = inputView;
        this.oncallService = oncallService;
    }

    public void run(){

    }
}

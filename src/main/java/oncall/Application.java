package oncall;

import oncall.config.AppConfig;
import oncall.controller.OncallController;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        AppConfig appConfig = new AppConfig();
        OncallController controller = appConfig.oncallController();
        controller.run();
    }
}

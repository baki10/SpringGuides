package com.bakigoal;

import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ilmir on 22.07.16.
 */
@Controller
public class DeviceDetectionController {

  @RequestMapping("/detect-device")
  @ResponseBody
  public String detectDevice(Device device) {
    String deviceType = "unknown";
    if (device.isNormal()) {
      deviceType = "normal";
    } else if (device.isMobile()) {
      deviceType = "mobile";
    } else if (device.isTablet()) {
      deviceType = "tablet";
    }
    return "Hello " + deviceType + " browser!";
  }
}

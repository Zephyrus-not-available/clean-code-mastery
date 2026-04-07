# Chapter 7 Error Handling Exercise (လေ့ကျင့်ခန်း)

## 1. Dirty Code (ပြင်ဆင်ရန် ကုဒ်)

Return Codes ကို အသုံးပြုခြင်းကြောင့် လုပ်ဆောင်ရမည့် Logic နှင့် Error စစ်ဆေးရမည့် Logic များ ရောထွေးနေသည်။

```java
public void processDevice() {
    DeviceHandle handle = getHandle(DEV1);
    // Check for error
    if (handle != DeviceHandle.INVALID) {
        DeviceRecord record = retrieveDeviceRecord(handle);
        if (record.getStatus() != DEVICE_SUSPENDED) {
            pauseDevice(handle);
            clearDeviceWorkQueue(handle);
            // ...
        } else {
            logger.log("Device suspended.");
        }
    } else {
        logger.log("Invalid handle");
    }
}
```

## 2. လုပ်ဆောင်ရမည့် အချက်များ (Task)
Return codes များ အစား Exception များကို Throw လုပ်ပါ။ `try-catch` block များကို သီးသန့် Method တစ်ခုအနေဖြင့် ခွဲထုတ်ပါ။

# Chapter 8 Boundaries Exercise (လေ့ကျင့်ခန်း)

## 1. Dirty Code (ပြင်ဆင်ရန် ကုဒ်)

Third-party library တစ်ခုလုံးကို system အနှံ့ ဖြန့်ကျက် အသုံးပြုထားသည်။

```java
Map<Sensor, String> sensors = new HashMap<>();
// System ရဲ့ နေရာပေါင်းများစွာမှာ Map ကို တိုက်ရိုက်သုံးနေခြင်း
```

## 2. လုပ်ဆောင်ရမည့် အချက်များ (Task)
Third-party boundary များကို ဖုံးကွယ်ရန် (Encapsulation) `Sensors` ဆိုသော Class အသစ်တစ်ခု တည်ဆောက်ပြီး ထို Class ထဲမှသာ `Map` ကို အသုံးပြုရန် ပြင်ဆင်ပါ။

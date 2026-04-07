# Chapter 10 Classes Exercise (လေ့ကျင့်ခန်း)

## 1. Dirty Code (ပြင်ဆင်ရန် ကုဒ်)

Super Class (သို့) God Class ကြီးတစ်ခုဖြစ်ပြီး တာဝန်များစွာ (Responsibilities) ကို ယူထားသည်။

```java
public class SuperDashboard {
    public void printReport() { ... }
    public void saveToDatabase() { ... }
    public void calculateMetrics() { ... }
    public void renderUI() { ... }
}
```

## 2. လုပ်ဆောင်ရမည့် အချက်များ (Task)
Single Responsibility Principle (SRP) ကို လိုက်နာရန် အလုပ်တစ်ခုတည်းကိုသာ အာရုံစိုက်သော Class အသေးလေးများ (ဥပမာ `ReportPrinter`, `MetricsCalculator`) အဖြစ် ခွဲထုတ်ပါ။

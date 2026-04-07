# Chapter 9 Unit Tests Exercise (လေ့ကျင့်ခန်း)

## 1. Dirty Code (ပြင်ဆင်ရန် ကုဒ်)

Test တစ်ခုတည်းတွင် အလုပ်များစွာ စစ်ဆေးနေပြီး ရှင်းလင်းမှုမရှိပါ။

```java
@Test
public void testSystem() {
    SystemManager sys = new SystemManager();
    sys.start();
    assertEquals(true, sys.isReady());
    sys.loadConfig("config.xml");
    assertEquals(10, sys.getTimeout());
    sys.stop();
    assertEquals(false, sys.isReady());
}
```

## 2. လုပ်ဆောင်ရမည့် အချက်များ (Task)
"Single Concept per Test" စည်းမျဉ်းအရ သီးခြား Unit Test လေးများအဖြစ် ခွဲထုတ်ပါ။ Given-When-Then pattern ဖြင့် အမည်များကို ပြင်ဆင်ပါ။

# အခန်း ၂ - အဓိပ္ပါယ်ရှိသော အမည်များ (Chapter 2 - Meaningful Names)

ရည်ရွယ်ချက်ကို ပေါ်လွင်စေသော အမည်များကို အဓိကထားပါ၊ မှားယွင်းသော သတင်းအချက်အလက်များကို ရှောင်ကြဉ်ပါ၊ ထို့အပြင် စိတ်ထဲတွင် ဘာသာပြန်ဆိုရမှုများကို လျှော့ချပါ။

## Clean Code စာအုပ်မှ အဓိက အခြေခံမူများ (Robert C. Martin)

၁။ **ရည်ရွယ်ချက်ကို ပေါ်လွင်စေသော အမည်များကို သုံးပါ (Use Intention-Revealing Names)**: Variable, function, (သို့) class တစ်ခု၏ အမည်သည် အဘယ်ကြောင့်ရှိနေသနည်း၊ မည်သို့အလုပ်လုပ်သနည်း၊ ၎င်းကို မည်သို့အသုံးပြုသနည်း ဟူသော မေးခွန်းများကို ဖြေဆိုနိုင်ရမည်။

| မကောင်းသော ဥပမာ (Bad) | ကောင်းသော ဥပမာ (Good) | ရှင်းလင်းချက် (Explanation) |
| :--- | :--- | :--- |
| `int d;` | `int elapsedTimeInDays;` | Variable သည် အဘယ်အရာဖြစ်ကြောင်း ရှင်းလင်းစွာ ဖော်ပြသည်။ |
| `int s;` | `int userStatus;` | ရည်ရွယ်ချက်ကို အတိအကျ ဖော်ပြထားသည်။ |
| `List<int[]> getThem()` | `List<Cell> getFlaggedCells()` | မည်သည့် Data ကို ယူနေကြောင်း ရှင်းလင်းသည်။ |
| `void calc()` | `void calculateMonthlyPay()` | လုပ်ဆောင်ချက်ကို ပြည့်စုံစွာ ဖော်ပြထားသည်။ |

၂။ **မှားယွင်းသော အချက်အလက်များကို ရှောင်ပါ (Avoid Disinformation)**: အမှန်တကယ် `List` မဟုတ်ပါက account များကို `accountList` ဟု မမှည့်ပါနှင့်။ `hp`, `aix` ကဲ့သို့သော တခြားအဓိပ္ပါယ်ရှိပြီးသား စကားလုံးများကို ရှောင်ပါ။

| မကောင်းသော ဥပမာ (Bad) | ကောင်းသော ဥပမာ (Good) | ရှင်းလင်းချက် (Explanation) |
| :--- | :--- | :--- |
| `Account[] accountList;` | `Account[] accounts;` | Array ဖြစ်နေသဖြင့် List ဟု မခေါ်သင့်ပါ။ |
| `String hp;` | `String hypotenuse;` | HP (Hewlett-Packard) ဟု အထင်မှားနိုင်မှုကို ရှောင်သည်။ |
| `int O = 1;` | `int zeroCount = 1;` | သုည (0) နှင့် တူနေသော အက္ခရာ `O` ကို ရှောင်သည်။ |
| `int l = 2;` | `int count = 2;` | နံပါတ် (1) နှင့် တူနေသော အက္ခရာ `l` (L) ကို ရှောင်သည်။ |

၃။ **အဓိပ္ပါယ်ရှိသော ကွဲပြားမှုများကို ပြုလုပ်ပါ (Make Meaningful Distinctions)**: ဂဏန်းများ တပ်၍ (`a1`, `a2`) အမည်ပေးခြင်းသည် ရည်ရွယ်ချက်မရှိလှပါ။ `ProductInfo` နှင့် `ProductData` ကဲ့သို့သော အဓိပ္ပါယ်တူနေသည့် အပိုစကားလုံးများကိုလည်း ရှောင်ပါ။

| မကောင်းသော ဥပမာ (Bad) | ကောင်းသော ဥပမာ (Good) | ရှင်းလင်းချက် (Explanation) |
| :--- | :--- | :--- |
| `void copy(char a1[], char a2[])` | `void copy(char source[], char dest[])` | တိကျသော ရည်ရွယ်ချက်ကို ခွဲခြားပေးသည်။ |
| `class ProductData` | `class Product` | အဓိပ္ပါယ်မရှိသော `Data` အပိုစကားလုံးကို ဖယ်ရှားသည်။ |
| `class ProductInfo` | `class ProductDetails` | သတင်းအချက်အလက်ကို ပိုမိုတိကျစေသည်။ |
| `String nameString;` | `String name;` | Data type ဖော်ပြခြင်းကို ရှောင်သည်။ |

၄။ **အသံထွက်ဖတ်၍ရသော အမည်များကို သုံးပါ (Use Pronounceable Names)**: အသံထွက်မဖတ်နိုင်ပါက အခြားသူများနှင့် ဆွေးနွေးရာတွင် အခက်အခဲဖြစ်စေနိုင်သည်။

| မကောင်းသော ဥပမာ (Bad) | ကောင်းသော ဥပမာ (Good) | ရှင်းလင်းချက် (Explanation) |
| :--- | :--- | :--- |
| `Date genymdhms;` | `Date generationTimestamp;` | ဆွေးနွေးရာတွင် အလွယ်တကူ အသံထွက်ဖတ်နိုင်သည်။ |
| `String modymdhms;` | `String modificationTimestamp;` | လူနားလည်နိုင်သော စကားလုံးများ သုံးထားသည်။ |
| `int pszqint;` | `int recordCount;` | အဓိပ္ပါယ်မဲ့ အတိုကောက်များကို ရှောင်သည်။ |
| `class DtaRcrd102` | `class CustomerRecord` | ရှင်းလင်းပြတ်သားပြီး ဖတ်ရလွယ်ကူသည်။ |

၅။ **ရှာဖွေရလွယ်ကူသော အမည်များကို သုံးပါ (Use Searchable Names)**: စာလုံးတစ်လုံးတည်း (Single-letter) နှင့် နံပါတ်ကိန်းသေများသည် Code ထဲတွင် ရှာဖွေရခက်သည်။ အမည်အရှည်သည် ၎င်း၏ အသုံးပြုမှုအတိုင်းအတာ (Scope) နှင့် ကိုက်ညီသင့်သည်။

| မကောင်းသော ဥပမာ (Bad) | ကောင်းသော ဥပမာ (Good) | ရှင်းလင်းချက် (Explanation) |
| :--- | :--- | :--- |
| `int e;` | `int employeeId;` | Search လုပ်သည့်အခါ အလွယ်တကူ ရှာတွေ့နိုင်သည်။ |
| `if (days > 7)` | `if (days > MAX_WEEK_DAYS)` | ကိန်းသေ (Magic Number) အစား အမည်ကို သုံးသည်။ |
| `for (int j=0; j<34; j++)` | `for (int j=0; j<NUMBER_OF_TASKS; j++)` | အဓိပ္ပါယ်ရှိသော ကိန်းသေကို သုံးသည်။ |
| `String v;` | `String versionNumber;` | Variable ၏ Scope အလျောက် အမည်ရှည်ပေးသည်။ |

၆။ **အက္ခရာဝှက်ခြင်း (Encodings) များကို ရှောင်ပါ (Avoid Encodings)**: Hungarian notation, ရှေ့ဆက်များ (ဥပမာ `m_`) နှင့် Interface များတွင် `I` (ဥပမာ `IShapeView` အစား `ShapeView`) အသုံးပြုခြင်းကို ရှောင်ပါ။

| မကောင်းသော ဥပမာ (Bad) | ကောင်းသော ဥပမာ (Good) | ရှင်းလင်းချက် (Explanation) |
| :--- | :--- | :--- |
| `String m_dsc;` | `String description;` | member prefix များကို ရှောင်သည်။ |
| `interface IShape` | `interface Shape` | Interface ရှေ့ဆက် `I` ကို ရှောင်သည်။ |
| `boolean bIsValid;` | `boolean isValid;` | Type ဖော်ပြသော prefix များကို ရှောင်သည်။ |
| `class ShapeImpl` | `class Circle` | Impl အစား တိကျသော အမည်ကို သုံးသည်။ |

၇။ **စိတ်ထဲတွင် ဘာသာပြန်ရခြင်းများကို ရှောင်ပါ (Avoid Mental Mapping)**: ဖတ်ရှုသူများသည် သင်၏အမည်များကို သူတို့သိပြီးသား အခြားအမည်များသို့ စိတ်ထဲတွင် ဘာသာပြန်ဆိုစရာ မလိုသင့်ပါ။

| မကောင်းသော ဥပမာ (Bad) | ကောင်းသော ဥပမာ (Good) | ရှင်းလင်းချက် (Explanation) |
| :--- | :--- | :--- |
| `int r;` | `int urlLength;` | `r` ကို url အရှည်ဟု မှတ်သားရန် မလိုတော့ပါ။ |
| `String a;` | `String serverAddress;` | အဓိပ္ပါယ်ရှိသော စကားလုံးကို သုံးသည်။ |
| `int loop;` | `int retryCount;` | ရည်ရွယ်ချက်အတိအကျကို ဖော်ပြသည်။ |
| `boolean flag;` | `boolean isReady;` | Object ၏ အခြေအနေကို ပိုမို ရှင်းလင်းစေသည်။ |

၈။ **Class အမည်များ (Class Names)**: Class နှင့် Object အမည်များသည် `Customer`, `WikiPage`, `Account` ကဲ့သို့သော နာမ် (Nouns) သို့မဟုတ် နာမ်ပုဒ်များ (Noun phrases) ဖြစ်သင့်သည်။

| မကောင်းသော ဥပမာ (Bad) | ကောင်းသော ဥပမာ (Good) | ရှင်းလင်းချက် (Explanation) |
| :--- | :--- | :--- |
| `class ParseData` | `class DataParser` | Class များသည် နာမ် (Noun) ဖြစ်သင့်သည်။ |
| `class ManageUser` | `class UserManager` | ကြိယာ (Verb) အသုံးပြုခြင်းကို ရှောင်သည်။ |
| `class CustomerInfo` | `class Customer` | အဓိပ္ပါယ်မဲ့သော Info/Data များကို ရှောင်သည်။ |
| `class ProcessBilling` | `class BillingProcessor` | Object (အရာဝတ္ထု) ဆန်သော အမည်ကို သုံးသည်။ |

၉။ **Method အမည်များ (Method Names)**: Method များသည် `postPayment`, `deletePage` သို့မဟုတ် `save` ကဲ့သို့သော ကြိယာ (သို့) ကြိယာပုဒ်များ ဖြစ်သင့်သည်။

| မကောင်းသော ဥပမာ (Bad) | ကောင်းသော ဥပမာ (Good) | ရှင်းလင်းချက် (Explanation) |
| :--- | :--- | :--- |
| `void payment()` | `void processPayment()` | Method သည် လုပ်ဆောင်ချက် (Verb) ဖြစ်သင့်သည်။ |
| `boolean valid()` | `boolean isValid()` | စစ်ဆေးမှုများအတွက် is/has ဖြင့် စသည်။ |
| `void name(String n)` | `void setName(String n)` | Setter များအတွက် set ဖြင့် စသည်။ |
| `String name()` | `String getName()` | Getter များအတွက် get ဖြင့် စသည်။ |

၁၀။ **အလွန်အမင်း ဉာဏ်များလွန်းသော အမည်များကို ရှောင်ပါ (Don't Be Cute)**: ဖတ်ရှုသူတိုင်း နားလည်နိုင်သော ရိုးရှင်းသည့် စကားလုံးများကို သုံးပါ၊ အဓိပ္ပါယ်ကို တည့်တည့်ပြောပါ။

| မကောင်းသော ဥပမာ (Bad) | ကောင်းသော ဥပမာ (Good) | ရှင်းလင်းချက် (Explanation) |
| :--- | :--- | :--- |
| `void holyHandGrenade()`| `void deleteAllItems()` | နောက်ပြောင်သော အမည်များကို ရှောင်သည်။ |
| `void whack()` | `void killProcess()` | တိုက်ရိုက် အဓိပ္ပါယ်ရှိသော စကားလုံးကို သုံးသည်။ |
| `void eatMyShorts()` | `void abortSequence()` | Professional ဖြစ်သော အသုံးအနှုန်းကို သုံးသည်။ |
| `boolean isChill()` | `boolean isIdle()` | ရိုးရှင်းပြီး နားလည်လွယ်သည်။ |

၁၁။ **သဘောတရားတစ်ခုအတွက် စကားလုံးတစ်လုံးကိုသာ ရွေးချယ်ပါ (Pick One Word per Concept)**: အဓိပ္ပါယ်တူသောအရာအတွက် စကားလုံးတစ်လုံးကိုသာ သုံးပါ (ဥပမာ `fetch`, `retrieve`, `get`)။

| မကောင်းသော ဥပမာ (Bad) | ကောင်းသော ဥပမာ (Good) | ရှင်းလင်းချက် (Explanation) |
| :--- | :--- | :--- |
| `fetchData()` | `getData()` | တစ်သမတ်တည်းဖြစ်သော ဝေါဟာရကို သုံးသည်။ |
| `retrieveUser()` | `getUser()` | `get` ကို နေရာတိုင်းတွင် တူညီစွာ သုံးသည်။ |
| `DeviceManager` | `DeviceController` | Manager, Controller စသည်တို့ကို ရောမသုံးပါ။ |
| `UserController` | `UserController` | အထက်ပါအတိုင်း တူညီသော pattern သုံးသည်။ |

၁၂။ **စကားလုံးတစ်လုံးတည်းကို အဓိပ္ပါယ်နှစ်မျိုးဖြင့် မသုံးပါနှင့် (Don't Pun)**: လုပ်ဆောင်ချက်နှစ်မျိုးအတွက် စကားလုံးတူတစ်ခုတည်းကို မသုံးပါနှင့်။

| မကောင်းသော ဥပမာ (Bad) | ကောင်းသော ဥပမာ (Good) | ရှင်းလင်းချက် (Explanation) |
| :--- | :--- | :--- |
| `add(int a, int b)` | `add(int a, int b)` | ကိန်းဂဏန်း ပေါင်းခြင်းအတွက် `add` သုံးသည်။ |
| `add(Item item)` | `append(Item item)` | Collection ထဲထည့်ခြင်းအတွက် `append/insert` သုံးသည်။ |
| `start(Thread t)` | `start(Thread t)` | Thread ကိုစတင်ရန် သုံးသည်။ |
| `start(Timer t)` | `resume(Timer t)` | ရပ်နေသည်ကို ပြန်စရန် `resume` အဖြစ် ခွဲခြားသည်။ |

၁၃။ **နည်းပညာ/ပရိုဂရမ်မာ အသုံးအနှုန်းများကို သုံးပါ (Use Solution Domain Names)**: ကွန်ပျူတာသိပ္ပံ (CS) စကားလုံးများ၊ algorithm အမည်များ၊ pattern အမည်များကို ရဲရဲဝံ့ဝံ့ သုံးပါ။

| မကောင်းသော ဥပမာ (Bad) | ကောင်းသော ဥပမာ (Good) | ရှင်းလင်းချက် (Explanation) |
| :--- | :--- | :--- |
| `class AccountGroup` | `class AccountFactory` | Factory Pattern ကို သုံးထားကြောင်း ပြသည်။ |
| `class Doer` | `class TaskObserver` | Observer Pattern အမည်ကို သုံးသည်။ |
| `class NameTree` | `class NameBTree` | တိကျသော Data Structure (BTree) ကို သုံးသည်။ |
| `class SortItems` | `class QuickSorter` | အသုံးပြုထားသော Algorithm ကို ရှင်းပြသည်။ |

၁၄။ **ပြဿနာ/လုပ်ငန်းဆိုင်ရာ အသုံးအနှုန်းများကို သုံးပါ (Use Problem Domain Names)**: ပရိုဂရမ်မာ အသုံးအနှုန်း မရှိပါက၊ လုပ်ငန်းဆိုင်ရာ (Problem Domain) မှ နာမည်များကို သုံးပါ။

| မကောင်းသော ဥပမာ (Bad) | ကောင်းသော ဥပမာ (Good) | ရှင်းလင်းချက် (Explanation) |
| :--- | :--- | :--- |
| `class MoneyCalc` | `class CompoundInterestCalc`| လုပ်ငန်းဆိုင်ရာ အမည်ပေးထားသည်။ |
| `class UserCheck` | `class KYCValidator` | (Know Your Customer) လုပ်ငန်းပိုင်း အမည်သုံးသည်။ |
| `boolean badHistory` | `boolean hasDefaultRecord` | ဘဏ်လုပ်ငန်းဆိုင်ရာ အခေါ်အဝေါ်ကို သုံးသည်။ |
| `class Package` | `class CargoShipment` | ပို့ဆောင်ရေးလုပ်ငန်းအမည်ကို အတိအကျ သုံးသည်။ |

၁၅။ **အဓိပ္ပါယ်ရှိသော အဆက်အစပ် (Context) ကို ထည့်ပါ (Add Meaningful Context)**: Class များ၊ Function များ သို့မဟုတ် Namespace များဖွဲ့၍ အမည်များကို အဓိပ္ပါယ်ပိုရှိလာအောင် ပြုလုပ်ပါ။

| မကောင်းသော ဥပမာ (Bad) | ကောင်းသော ဥပမာ (Good) | ရှင်းလင်းချက် (Explanation) |
| :--- | :--- | :--- |
| `String state;` | `address.getState();` | Address class ထဲထည့်၍ context ဖန်တီးသည်။ |
| `String mac;` | `class NetworkContext { String mac; }`| Network ဆိုင်ရာဟု အဆက်အစပ်ပြသည်။ |
| `void saveUser(String n, int a)`| `void saveUser(User u)` | Data များကို Object ဖွဲ့၍ ဆက်စပ်ပေးသည်။ |
| `int port;` | `serverConfig.getPort();` | မည်သည့် port ဖြစ်ကြောင်း တိကျသွားသည်။ |

၁၆။ **မလိုအပ်သော အဆက်အစပ်များကို မထည့်ပါနှင့် (Don't Add Gratuitous Context)**: နာမည်တိုများက နားလည်လွယ်သရွေ့ ပိုကောင်းပါသည်။

| မကောင်းသော ဥပမာ (Bad) | ကောင်းသော ဥပမာ (Good) | ရှင်းလင်းချက် (Explanation) |
| :--- | :--- | :--- |
| `class GSDAccount` | `class Account` | မလိုအပ်သော application prefix ကို ဖယ်သည်။ |
| `class WebAppUser` | `class User` | Context ရှိပြီးရာတွင် ထပ်မံထည့်ခြင်းကို ရှောင်သည်။ |
| `class CarDoors` | `class Door` | Car class ထဲတွင် Door ဟုသာ မှည့်ရန်လုံလောက်သည်။ |
| `enum MacColors` | `enum Color` | MacOs အတွက်ဖြစ်သော်လည်း Color ဟုသာ မှည့်နိုင်သည်။ |

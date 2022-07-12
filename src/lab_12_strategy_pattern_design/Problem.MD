PROBLEM:
2 Dac Tinh (2 responsibilities) cua 1 nhom chung chung ve Duck
 -quack: quack, squack, mute
 -fly  : flyWithWing, flyNoWing

Module "Duck" co the co nhieu loai: MallardDuck, BabyDuck, DecoyDuck

-------------------------
SOLUION:
1) truu tuong hoa : Duck se co quack() , fly()
2) Cu the quack(), fly() ntn thi se define in concrete classes => 2 interfaces
     <<QuackBehavior>> : QuackQuack, QuackSquack, QuackMute
     <<FlyBehavior>>   : FlyWithWing, FlyNoWing



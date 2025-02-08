1. SRP (Single Responsibility Principle) Each class is responsible for one specific task:

Player manages the player logic.
Enemy contains enemy data.
BCharacteristic is responsible for the characteristics.
RandomEnemy creates enemies.
Main only starts the game.
If in the future you need to change, for example, the enemy creation system, you do not need to touch the player logic.

2. OCP (Open/Closed Principle)
The code is open for extension, but closed for modification:

To add a new enemy, just extend EnemyF without changing Player.
You can create a BossEnemy if you need a different enemy creation system.


3. LSP (Liskov Substitution Principle)
Player works with Attack, Defens, HP, and not with BCharacteristic.
Now you can replace BCharacteristic with any other implementation and the code will not break.

4. ISP (Interface Segregation Principle)
Previously there was one Characteristic interface with all methods, but now:

Attack is only responsible for attack.
Defens is only responsible for defense.
HP only controls health.
Now each class implements only the necessary methods, not everything.

5. DIP (Dependency Inversion Principle)
Previously Player created BCharacteristic and Enemy directly. Now:

Player depends on interfaces, not on specific classes.
EnemyF is passed to Player, not created inside it.
Now you can replace RandomEnemy with BossEnemy, and the code will continue to work without changes.

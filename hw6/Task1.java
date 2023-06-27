/* Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Класс сделать в отдельном файле

приветствие
Выбор параметра
выбор конкретнее
вывод подходящих */

package HomeWorks.hw6;

class Shop {
    class Notebook{
        Brandname brandname;
        Category category;
        ScreenSize screenSize;
        Resolution resolution;
        DisplayRate displayRate;
        Processor processor;
        RAM ram;
        Videocard videocard;
        HDD hdd;
        OS os;
        Color color;

        enum Brandname{
            Apple,
            Acer,
            ASUS,
            HUAWEI,
            Lenovo,
            Microsoft,
            Xiaomi,
            GIGABYTE,
            MSI,
            Samsung
        }

        enum Category{
            Ordinary,
            Gaming,
            Tablet,
            Transformer
        }

        enum ScreenSize{
            Mini,      // < 10,1
            Portable,  // 10,1 11,6, 12,5, 13,3,
            Universal, // 14,1, 15,6,
            Huge       // > 17,3 18,4 
        }

        enum Resolution{
            HD,     // 720
            FullHD, // 1080
            QHD,    // 1440
            UHD     // 2160
        }

        enum DisplayRate{
            Hz60,
            Hz120,
            Hz144,
            Hz240
        }

        enum Processor{
            Apple,
            Intel,
            AMD
        }

        enum RAM{
            Gb8,
            Gb16,
            Gb32,
            Gb64,
            Gb128
        }

        enum Videocard{
            Intel,
            NVIDIA,
            AMD
        }

        enum HDD{
            Tb1,
            Tb2,
            Tb4,
            Tb8
        }

        enum OS{
            Linux,
            MacOS,
            Windows,
            DOS,
            None
        }

        enum Color{
            Red,
            Yellow,
            Green,
            Blue,
            Black,
            White,
            Silver,
            Gold,
            Grey
        }



    }
}


public class Task1 {
    public static void main(String[] args) {
        Notebook note1 = new Notebook();
        note1.brandname = Brandname.Lenovo;
        
    }
}

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import HomeWorks.hw6.Shop.Notebook;

class Shop {
    // Notebook[] notebooks;
    List<Notebook> notebookArrayList;

    public class Notebook{
        String brandname;
        int screenSizeInch;
        int displayRate;
        String processor;
        int ramVolume;
        String videocard;
        Integer hddVolume;
        String os;
        String color;

        public Notebook(String brandname, int screenSizeInch, int displayRate, String processor, int ramVolume, String videocard, Integer hddVolume, String os, String color) {
            this.brandname = brandname;
            this.screenSizeInch = screenSizeInch;
            this.displayRate = displayRate;
            this.processor = processor;
            this.ramVolume = ramVolume;
            this.videocard = videocard;
            this.hddVolume = hddVolume;
            this.os = os;
            this.color = color;
        }

        public Notebook(String brandname){
            this.brandname = brandname;
        }

        public Notebook(){

        }

        @Override
        public String toString() {
            // return ""+brandname+" "+screenSizeInch+" "+displayRate+" "+processor+" "+ramVolume+" "+videocard+" "+hddVolume+" "+os+" "+color+"";
            return ""+brandname+"|"+screenSizeInch+"|"+displayRate+"|"+processor+"|"+ramVolume+"|"+videocard+"|"+hddVolume+"|"+os+"|"+color+"";
        }
    }

    public void print() {
        int maxStrLength = 0;
        StringBuilder line = new StringBuilder("");
        String title = "|brandname|screenSizeInch|displayRate|processor|ramVolume|videocard|hddVolume|os|color|";
        String textAlign = "|:----|:----|:----|:----|:----|:----|:----|:----|:----|";
        System.out.println(title);
        System.out.println(textAlign);
        for (Notebook notebook : this.notebookArrayList) {
            if (notebook.toString().length() > maxStrLength) {
                maxStrLength = notebook.toString().length();
            }
            System.out.println(notebook);
        }
        for (int i = 0; i < maxStrLength; i++) {
            line.append("-");
        }
        System.out.println(line.toString());
    } 

    public List<Notebook> insertRandom(int quantity) {
        Notebook[] notebooksRnd = new Notebook[quantity];
        this.notebookArrayList = Arrays.asList(notebooksRnd);
        Random rnd = new Random();

        String[] brands = new String[] {"Apple", "Acer", "ASUS", "HUAWEI", "Lenovo", "Microsoft", "Xiaomi", "GIGABYTE", "MSI", "Samsung"};
        Integer[] screenSize = new Integer[] {10, 11, 12, 13, 14, 15, 16, 17, 18};
        Integer[] displayRate = new Integer[] {50, 60, 100, 120, 144, 240};
        String[] processor = new String[] {"Apple", "Intel", "AMD"};
        Integer[] ramVolume = new Integer[] {4, 8, 16, 32, 64, 128, 256};
        String[] videocard = new String[] {"Intel", "AMD", "NVIDIA"};
        Integer[] hddVolume = new Integer[] {1, 2, 4, 8, 16, 32};
        String[] os = new String[] {"MacOS", "Linux", "Windows", "DOS", "None"};
        String[] color = new String[] {"Red", "Yellow", "Green", "Blue", "Black", "White", "Silver", "Gold", "Grey"};

        for (int i = 0; i < quantity; i++) {
            notebooksRnd[i] = new Notebook(brands[rnd.nextInt(brands.length)], screenSize[rnd.nextInt(screenSize.length)], displayRate[rnd.nextInt(displayRate.length)], processor[rnd.nextInt(processor.length)], ramVolume[rnd.nextInt(ramVolume.length)], videocard[rnd.nextInt(videocard.length)], hddVolume[rnd.nextInt(hddVolume.length)], os[rnd.nextInt(os.length)], color[rnd.nextInt(color.length)]);
        }
        
        return this.notebookArrayList;
    }

       

}


public class Task1 {
    public static void main(String[] args) {
        Shop electronic = new Shop(); 
        electronic.insertRandom(100);
        electronic.print();
        
    }
}

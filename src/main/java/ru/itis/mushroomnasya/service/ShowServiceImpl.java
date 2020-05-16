package ru.itis.mushroomnasya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.mushroomnasya.models.Genre;
import ru.itis.mushroomnasya.models.Show;
import ru.itis.mushroomnasya.repositories.ShowRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ShowServiceImpl implements ShowService{

    @Autowired
    ShowRepository showRepository;

    @Override
    public List<Show> getShowList(List<Show> myShows) {
        List<Show> recommendedShows = new ArrayList<>();
        List<Show> allShows = showRepository.findAll();

        if (myShows.size() == 0){
            for (int i = 1; i < 6; i++) {
                if (showRepository.findByIdShow(i) != null) {
                    if ((!checkShow(showRepository.findByIdShow(i), myShows)) && (!checkShow(showRepository.findByIdShow(i), recommendedShows))) {
                        recommendedShows.add(showRepository.findByIdShow(i));
                    }
                }
            }
        }

        int[] genres = new int[25];

        Arrays.fill(genres, 0);

        for (Show show : myShows) {
            if (show.getGenre().equals(Genre.Adult)) {
                genres[0]++;
            }
            if (show.getGenre().equals(Genre.Animation)) {
                genres[1]++;
            }
            if (show.getGenre().equals(Genre.Anime)) {
                genres[2]++;
            }
            if (show.getGenre().equals(Genre.Comedy)) {
                genres[3]++;
            }
            if (show.getGenre().equals(Genre.Cooking)) {
                genres[4]++;
            }
            if (show.getGenre().equals(Genre.Crime)) {
                genres[5]++;
            }
            if (show.getGenre().equals(Genre.Detective)) {
                genres[6]++;
            }
            if (show.getGenre().equals(Genre.Documentary)) {
                genres[7]++;
            }
            if (show.getGenre().equals(Genre.Education)) {
                genres[8]++;
            }
            if (show.getGenre().equals(Genre.Family)) {
                genres[9]++;
            }
            if (show.getGenre().equals(Genre.Fantasy)) {
                genres[10]++;
            }
            if (show.getGenre().equals(Genre.Food)) {
                genres[11]++;
            }
            if (show.getGenre().equals(Genre.Horror)) {
                genres[12]++;
            }
            if (show.getGenre().equals(Genre.Musical)) {
                genres[13]++;
            }
            if (show.getGenre().equals(Genre.Romance)) {
                genres[14]++;
            }
            if (show.getGenre().equals(Genre.ScienceFiction)) {
                genres[15]++;
            }
            if (show.getGenre().equals(Genre.SciFi)) {
                genres[16]++;
            }
            if (show.getGenre().equals(Genre.Sketch)) {
                genres[17]++;
            }
            if (show.getGenre().equals(Genre.Sport)) {
                genres[18]++;
            }
            if (show.getGenre().equals(Genre.Spy)) {
                genres[19]++;
            }
            if (show.getGenre().equals(Genre.SuperHeroes)) {
                genres[20]++;
            }
            if (show.getGenre().equals(Genre.Supernatural)) {
                genres[21]++;
            }
            if (show.getGenre().equals(Genre.Teens)) {
                genres[22]++;
            }
            if (show.getGenre().equals(Genre.Thriller)) {
                genres[23]++;
            }
            if (show.getGenre().equals(Genre.Western)) {
                genres[24]++;
            }
        }

            while (recommendedShows.size() < 5) {
                int max = getMax(genres);
                if (max == -1)  {

                    for (int i = 1; i < 6; i++) {
                        if (showRepository.findByIdShow(i) != null) {
                            if ((!checkShow(showRepository.findByIdShow(i), myShows)) && (!checkShow(showRepository.findByIdShow(i), recommendedShows))) {
                                recommendedShows.add(showRepository.findByIdShow(i));
                            }
                        }
                    }
                    return recommendedShows;
                } else if (max == 0){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.Adult)){
                        if ((!checkShow(shoW, myShows)) && (!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }
                else if (max == 1){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.Animation)){
                        if ((!checkShow(shoW, myShows)) && (!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }else if (max == 2){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.Anime)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }else if (max == 3){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.Comedy)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }else if (max == 4){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.Cooking)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }else if (max == 5){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.Crime)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }else if (max == 6){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.Detective)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }else if (max == 7){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.Documentary)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }else if (max == 8){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.Education)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }else if (max == 9){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.Family)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }else if (max == 10){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.Fantasy)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }else if (max == 11){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.Food)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }else if (max == 12){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.Horror)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }else if (max == 13){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.Musical)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }else if (max == 14){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.Romance)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }else if (max == 15){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.ScienceFiction)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }else if (max == 16){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.SciFi)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }else if (max == 17){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.Sketch)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }else if (max == 18){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.Sport)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }else if (max == 19){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.Spy)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }else if (max == 20){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.SuperHeroes)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }else if (max == 21){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.Supernatural)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }else if (max == 22){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.Teens)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }
                else if (max == 23){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.Thriller)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }
                else if (max == 24){
                    for (Show shoW :  showRepository.findShowsByGenre(Genre.Western)){
                        if ((!checkShow(shoW, myShows))&&(!checkShow(shoW, recommendedShows))){
                            recommendedShows.add(shoW);
                        }
                    }
                }
                genres[max]=0;
            }

        return recommendedShows;
    }

    private int getMax(int[] arr){
        int max = 0;
        int index = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    private Boolean checkShow(Show show1, List<Show> list) {
        for (Show show : list) {
            if (show.getIdShow() == show1.getIdShow()) return true;
        }
        return false;
    }
}

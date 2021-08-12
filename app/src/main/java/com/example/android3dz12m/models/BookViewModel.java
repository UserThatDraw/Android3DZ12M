package com.example.android3dz12m.models;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.android3dz12m.R;

import java.util.ArrayList;
import java.util.List;

public class BookViewModel extends ViewModel {

    public MutableLiveData<List<BookModel>> listM = new MutableLiveData<>();
    public List<BookModel> bookLis = new ArrayList<>();

    public void addAll() {
        bookLis.add(new BookModel("Голова профессора Доуэля", "В своем знаменитом романе \"Голова профессора Доуэля\" один из пионеров отечественной фантастики Александр Беляев обратился к теме биологических экспериментов над человеком, гениально раскрыв проблему использования научных открытий в преступных целях. В основе произведения лежит история из жизни самого автора, когда болеющий и обездвиженный Беляев искал ответы на самые разные вопросы. Может ли существовать и способна ли мыслить человеческая голова, лишенная тела? А что может произойти, если человеческим разумом завладеет преступник?", R.drawable.golovaprofessora));
        bookLis.add(new BookModel("Град обреченный", "В то, что лучший, эталонный образец отечественной фантастики — «Град обреченный» братьев Стругацких — был задуман еще в конце 60-х гг., а завершен в 1972-м, — ТРУДНО ПОВЕРИТЬ, слишком уж поразительна, невозможна для тех времен степень внутренней свободы этого романа. ТАК не писали даже «в стол»... ТАКОЕ казалось невероятным. Однако вся невероятная, почти детективная история судьбы «Града обреченного», представленная в «Комментариях» к роману, заставляет поверить — было ИМЕННО ТАК. И читать роман от этого только интереснее!", R.drawable.gradobrechennyj));
        bookLis.add(new BookModel("Королевская битва", "Сюжет культовой японской антиутопии описывает военизированную игру, в которой участвуют школьники вымышленного тоталитарного государства. Здесь всё устроено по принципу их любимых компьютерных «бродилок» — вот только сражаться приходится в реальности, причём игра здесь ведётся на выживание.", R.drawable.korolevskayabitva));
        bookLis.add(new BookModel("Звездная тень", "Люди не смирились с ролью \"космических извозчиков\", обслуживающих сильные расы. Люди боролись за свободу. За право быть в космосе не прислужниками могущественных господ, но — равными среди равных. И вот они добились своего. Но достигнутый хрупкий мир висит на волоске. Когда этот волосок оборвется, война начнется снова. И в этой войне уже не будет правил. В ней будет единственный закон: цель оправдывает средства!", R.drawable.zvezdnayaten));
        bookLis.add(new BookModel("Атака на титанов", "В подземных катакомбах столицы орудуют разбойники, свои дерзкие набеги они осуществляют с помощью устройств пространственного маневрирования! В этом мастерстве главарь банды по имени Леви не уступает ветеранам разведкорпуса. И тогда лейтенант разведкорпуса Эрвин Смит предлагает банде сделку… Этот спин-офф «Атаки на титанов» рассказывает, как Леви прошел путь от городского бродяги до величайшего воина человечества.", R.drawable.atakatitanov));
        listM.setValue(bookLis);
    }
}
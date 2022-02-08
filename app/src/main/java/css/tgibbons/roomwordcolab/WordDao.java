package css.tgibbons.roomwordcolab;


import androidx.lifecycle.LiveData;
import androidx.room.*;
import java.util.List;

@Dao
public interface WordDao {
    // allowing the insert of the same word multiple times by passing a
    // conflict resolution strategy
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Word word);

    @Query("DELETE FROM word_table")
    void deleteAll();

    @Query("SELECT * FROM word_table ORDER BY word ASC")
    //List<Word> getAlphabetizedWords();
    LiveData<List<Word>> getAlphabetizedWords();


}

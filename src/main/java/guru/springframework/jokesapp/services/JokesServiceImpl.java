package guru.springframework.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * @author john
 * @since 15/12/2023
 */
@Service
public class JokesServiceImpl implements JokesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}

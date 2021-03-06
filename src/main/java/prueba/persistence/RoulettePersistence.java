package prueba.persistence;
import org.springframework.stereotype.Service;
import prueba.model.Bet;
import prueba.model.Roulette;

import java.util.ArrayList;
import java.util.Map;

@Service
public interface RoulettePersistence {
    public String addRoulette();
    public void openRoulette(String id) throws RouletteException;
    public void betOnANumberOrColor(String id, Bet bet) throws RouletteException;
    public ArrayList<Bet> endOfBet(String id) throws RouletteException;
    public Map<Roulette,Boolean> getAllRoulette();
}

package guru.springframework.spring6resttemplate.client;

import guru.springframework.spring6resttemplate.model.BeerDTO;
import org.springframework.data.domain.Page;

/**
 * @author Donald F. Coffin, Green Button Alliance, Inc.
 */
public class BeerClientImpl implements BeerClient {
	@Override
	public Page<BeerDTO> listBeers() {
		return null;
	}
}

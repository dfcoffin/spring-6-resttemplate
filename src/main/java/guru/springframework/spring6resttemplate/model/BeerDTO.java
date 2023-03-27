package guru.springframework.spring6resttemplate.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author Donald F. Coffin, Green Button Alliance, Inc.
 */
@Builder
@Data
public class BeerDTO {
	private UUID id;
	private Integer version;
	private String beerName;
	private BeerStyle beerStyle;
	private String upc;
	private Integer quantityOnHand;
	private BigDecimal price;
	private LocalDateTime createdDate;
	private LocalDateTime updateDate;
}

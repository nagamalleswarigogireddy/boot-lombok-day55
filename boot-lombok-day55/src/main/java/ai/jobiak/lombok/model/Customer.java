package ai.jobiak.lombok.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
//@Data
@ToString(exclude= {"Id"})
@EqualsAndHashCode
public class Customer {
	@Setter
	@Getter
	@NonNull
	private long Id;
	@Setter
	@Getter
	private String name;
	@Setter
	@Getter
	private  double balance;
	}


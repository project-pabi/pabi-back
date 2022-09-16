package entity;

import static lombok.AccessLevel.PROTECTED;

import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
public class test2 {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)

  private Long id;
  private long stock = 0;

  private long totalStock = 0;

  private long editingRoomStock = 0;
}


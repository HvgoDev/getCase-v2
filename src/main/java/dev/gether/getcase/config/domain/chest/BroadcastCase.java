package dev.gether.getcase.config.domain.chest;

import lombok.*;

import java.util.List;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BroadcastCase {
    private boolean enable;
    private List<String> messages;

}

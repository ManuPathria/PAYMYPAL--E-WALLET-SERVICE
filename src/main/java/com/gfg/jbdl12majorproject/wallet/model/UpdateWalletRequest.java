package com.gfg.jbdl12majorproject.wallet.model;

import com.gfg.jbdl12majorproject.TransactionManagementSystem.model.TransactionType;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UpdateWalletRequest {
    //This is details we are asking from user
    String fromUser;
    String toUser;
    Double amount;
    String transactionType;
    String transactionId;
}

package study.lotto.auto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import study.lotto.domain.Money;
import study.lotto.domain.Statics;

import static org.assertj.core.api.Assertions.assertThat;

class StaticsTest {

    @Test
    @DisplayName("renew 메서드 수행시, 수익률이 정확히 계산되는지 테스트")
    void renew_test() {
        Statics statics = new Statics(new Money("5000"));
        statics.renew(3);

        statics.calculateProfitRate();
        assertThat(statics.getProfitRate()).isEqualTo(1.00);
    }
}
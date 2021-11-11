package study.lotto.domain;

import java.util.List;

public class LottoNumbersGroup {

    private final List<LottoNumbers> lottoNumbersList;

    public LottoNumbersGroup(List<LottoNumbers> lottoNumbersList) {
        this.lottoNumbersList = lottoNumbersList;
    }

    public List<LottoNumbers> getLottoNumbersList() {
        return lottoNumbersList;
    }
}
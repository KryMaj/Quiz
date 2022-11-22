package com.projektquizu.quiz.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projektquizu.quiz.frontend.Difficulty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class CategoryQuestionCountInfoDto {
    @JsonProperty("category_id")
    private int categoryId;

    @JsonProperty("category_question_count")
    private CategoryQuestionCountDto categoryQuestionCount;

    public int getTotalQuestionCount() {
        return categoryQuestionCount.totalQuestionCount;
    }

    public int getQuestionCountForDifficulty(Difficulty difficulty) {
        switch (difficulty) {
            case EASY:
                return categoryQuestionCount.totalEasyQuestionCount;
            case MEDIUM:
                return categoryQuestionCount.totalMediumQuestionCount;
            case HARD:
                return categoryQuestionCount.totalHardQuestionCount;
        }
        return 0;
    }

    @NoArgsConstructor
    @Getter
    @ToString
    public static class CategoryQuestionCountDto {
        @JsonProperty("total_question_count")
        private int totalQuestionCount;
        @JsonProperty("total_easy_question_count")
        private int totalEasyQuestionCount;
        @JsonProperty("total_medium_question_count")
        private int totalMediumQuestionCount;
        @JsonProperty("total_hard_question_count")
        private int totalHardQuestionCount;
    }
}



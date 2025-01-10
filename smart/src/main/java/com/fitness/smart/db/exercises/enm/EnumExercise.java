package com.fitness.smart.db.exercises.enm;

public interface EnumExercise {
    public enum Muscle{
        // Upper Body Muscles
        // Chest (Pectorals)
        PECTORAL_MAJOR("Pectoralis Major"),
        PECTORAL_MINOR("Pectoralis Minor"),
        // Back
        LATISSIMUS_DORSI("Latissimus Dorsi"),
        TRAPEZIUS("Trapezius"),
        RHOMBOIDS("Rhomboids"),
        ERECTOR_SPINAE("Erector Spinae"),
        // Shoulders (Deltoids)
        ANTERIOR_DELTOID("Anterior Deltoid"),
        LATERAL_DELTOID("Lateral Deltoid"),
        POSTERIOR_DELTOID("Posterior Deltoid"),
        // Arms
        BICEPS_BRACHII("Biceps Brachii"),
        TRICEPS_BRACHII("Triceps Brachii"),
        BRACHIALIS("Brachialis"),
        BRACHIORADIALIS("Brachioradialis"),
        // Forearms
        FOREARM_FLEXORS("Forearm Flexors"),
        FOREARM_EXTENSORS("Forearm Extensors"),
        // Core Muscles
        RECTUS_ABDOMINIS("Rectus Abdominis"),
        EXTERNAL_OBLIQUES("External Obliques"),
        INTERNAL_OBLIQUES("Internal Obliques"),
        TRANSVERSE_ABDOMINIS("Transverse Abdominis"),
        ERECTOR_SPINAE_LOWER_BACK("Erector Spinae (Lower Back)"),
        QUADRATUS_LUMBORUM("Quadratus Lumborum"),
        // Lower Body Muscles
        // Glutes
        GLUTEUS_MAXIMUS("Gluteus Maximus"),
        GLUTEUS_MEDIUS("Gluteus Medius"),
        GLUTEUS_MINIMUS("Gluteus Minimus"),
        // Thighs
        RECTUS_FEMORIS("Rectus Femoris"),
        VASTUS_LATERALIS("Vastus Lateralis"),
        VASTUS_MEDIALIS("Vastus Medialis"),
        VASTUS_INTERMEDIUS("Vastus Intermedius"),
        BICEPS_FEMORIS("Biceps Femoris"),
        SEMITENDINOSUS("Semitendinosus"),
        SEMIMEMBRANOSUS("Semimembranosus"),
        // Adductors
        ADDUCTOR_MAGNUS("Adductor Magnus"),
        ADDUCTOR_LONGUS("Adductor Longus"),
        ADDUCTOR_BREVIS("Adductor Brevis"),
        GRACILIS("Gracilis"),
        // Calves
        GASTROCNEMIUS("Gastrocnemius"),
        SOLEUS("Soleus");

        private final String muscleName;

        Muscle(String muscleName) {
            this.muscleName = muscleName;
        }

        public String getMuscleName() {
            return muscleName;
        }
    }
    public enum Category{
        CHEST,
        CALVES,
        ADDUCTORS,
        BACK,
        SHOULDERS,
        ARMS,
        FOREARMS,
        CORE,
        GLUTES,
        THIGHS
    }
    public enum Intensity{
        EASY,
        MEDIUM,
        HARD,
        SUPER_HARD,
        CRAZY,
        HERCULES,
        SANSON,
        JESUS,
        ESCANOR,
        ABSOLUTE_UNITY
    }
}

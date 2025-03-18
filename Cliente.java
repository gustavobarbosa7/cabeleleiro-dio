@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    
    @OneToMany(mappedBy = "cliente")
    private List<Agendamento> agendamentos;
    
    // Getters e Setters
}

package es.ulpgc.eite.da.advquiz.question;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.da.advquiz.app.AppMediator;
import es.ulpgc.eite.da.advquiz.app.CheatToQuestionState;
import es.ulpgc.eite.da.advquiz.app.QuestionToCheatState;

public class QuestionPresenter implements QuestionContract.Presenter {

  public static String TAG = "AdvQuiz.QuestionPresenter";

  private AppMediator mediator;
  private WeakReference<QuestionContract.View> view;
  private QuestionState state;
  private QuestionContract.Model model;

  public QuestionPresenter(AppMediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void onCreatedCalled() {
    Log.e(TAG, "onCreatedCalled");

    // init the state
    state = new QuestionState();

    // TODO: include code if necessary
  }


  @Override
  public void onRecreatedCalled() {
    Log.e(TAG, "onRecreatedCalled");

    // TODO: include code if necessary
  }


  @Override
  public void onResumeCalled() {
    Log.e(TAG, "onResumeCalled");

    // TODO: include code if necessary

    // update the view
    view.get().displayQuestionData(state);

  }


  @Override
  public void onPauseCalled() {
    Log.e(TAG, "onPauseCalled");

    // TODO: include code if necessary

  }

  @Override
  public void onDestroyCalled() {
    Log.e(TAG, "onDestroyCalled");
  }

  @Override
  public void onOptionButtonClicked(int option) {
    Log.e(TAG, "onOptionButtonClicked");

    // TODO: include code if necessary
  }

  @Override
  public void onNextButtonClicked() {
    Log.e(TAG, "onNextButtonClicked");

    // TODO: include code if necessary
  }

  @Override
  public void onCheatButtonClicked() {
    Log.e(TAG, "onCheatButtonClicked");

    // TODO: include code if necessary
  }


  @Override
  public void injectView(WeakReference<QuestionContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(QuestionContract.Model model) {
    this.model = model;
  }

}
